
  package gen;
  public class S_Gen90 {
  		@com.google.inject.Inject
  		public S_Gen90(S_Gen91 s_gen91){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen91 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  