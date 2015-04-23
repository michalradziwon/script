
  package gen;
  public class S_Gen144 {
  		@com.google.inject.Inject
  		public S_Gen144(S_Gen145 s_gen145){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen145 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  