
  package gen;
  public class B_Gen118 {
  		@com.google.inject.Inject
  		public B_Gen118(B_Gen119 b_gen119){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen119 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  