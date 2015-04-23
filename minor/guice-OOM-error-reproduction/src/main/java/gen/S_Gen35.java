
  package gen;
  public class S_Gen35 {
  		@com.google.inject.Inject
  		public S_Gen35(S_Gen36 s_gen36){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen36 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  