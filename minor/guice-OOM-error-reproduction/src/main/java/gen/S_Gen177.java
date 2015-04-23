
  package gen;
  public class S_Gen177 {
  		@com.google.inject.Inject
  		public S_Gen177(S_Gen178 s_gen178){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen178 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  