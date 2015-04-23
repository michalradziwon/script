
  package gen;
  public class B_Gen49 {
  		@com.google.inject.Inject
  		public B_Gen49(B_Gen50 b_gen50){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen50 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  