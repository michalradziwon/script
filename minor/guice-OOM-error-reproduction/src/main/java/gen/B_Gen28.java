
  package gen;
  public class B_Gen28 {
  		@com.google.inject.Inject
  		public B_Gen28(B_Gen29 b_gen29){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen29 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  