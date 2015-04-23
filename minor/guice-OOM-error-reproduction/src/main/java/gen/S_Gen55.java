
  package gen;
  public class S_Gen55 {
  		@com.google.inject.Inject
  		public S_Gen55(S_Gen56 s_gen56){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen56 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  