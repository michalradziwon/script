
  package gen;
  public class S_Gen97 {
  		@com.google.inject.Inject
  		public S_Gen97(S_Gen98 s_gen98){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen98 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  