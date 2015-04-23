
  package gen;
  public class S_Gen25 {
  		@com.google.inject.Inject
  		public S_Gen25(S_Gen26 s_gen26){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen26 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  