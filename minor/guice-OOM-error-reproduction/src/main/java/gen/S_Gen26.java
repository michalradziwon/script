
  package gen;
  public class S_Gen26 {
  		@com.google.inject.Inject
  		public S_Gen26(S_Gen27 s_gen27){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen27 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  