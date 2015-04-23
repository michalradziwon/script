
  package gen;
  public class B_Gen129 {
  		@com.google.inject.Inject
  		public B_Gen129(B_Gen130 b_gen130){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen130 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  