
  package gen;
  public class H_Gen93 {
  		@com.google.inject.Inject
  		public H_Gen93(H_Gen94 h_gen94){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen94 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  