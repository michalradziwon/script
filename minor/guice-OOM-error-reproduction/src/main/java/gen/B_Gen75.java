
  package gen;
  public class B_Gen75 {
  		@com.google.inject.Inject
  		public B_Gen75(B_Gen76 b_gen76){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen76 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  