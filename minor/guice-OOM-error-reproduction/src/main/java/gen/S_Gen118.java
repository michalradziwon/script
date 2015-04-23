
  package gen;
  public class S_Gen118 {
  		@com.google.inject.Inject
  		public S_Gen118(S_Gen119 s_gen119){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen119 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  