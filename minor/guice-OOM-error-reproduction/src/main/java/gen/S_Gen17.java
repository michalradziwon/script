
  package gen;
  public class S_Gen17 {
  		@com.google.inject.Inject
  		public S_Gen17(S_Gen18 s_gen18){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen18 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  