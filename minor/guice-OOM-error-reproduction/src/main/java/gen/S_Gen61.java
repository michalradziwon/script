
  package gen;
  public class S_Gen61 {
  		@com.google.inject.Inject
  		public S_Gen61(S_Gen62 s_gen62){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen62 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  