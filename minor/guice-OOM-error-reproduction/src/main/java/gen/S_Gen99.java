
  package gen;
  public class S_Gen99 {
  		@com.google.inject.Inject
  		public S_Gen99(S_Gen100 s_gen100){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen100 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  