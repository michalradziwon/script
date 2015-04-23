
  package gen;
  public class S_Gen73 {
  		@com.google.inject.Inject
  		public S_Gen73(S_Gen74 s_gen74){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen74 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  