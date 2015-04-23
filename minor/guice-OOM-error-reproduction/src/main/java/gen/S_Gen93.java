
  package gen;
  public class S_Gen93 {
  		@com.google.inject.Inject
  		public S_Gen93(S_Gen94 s_gen94){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen94 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  