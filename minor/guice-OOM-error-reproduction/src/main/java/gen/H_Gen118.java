
  package gen;
  public class H_Gen118 {
  		@com.google.inject.Inject
  		public H_Gen118(H_Gen119 h_gen119){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen119 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  