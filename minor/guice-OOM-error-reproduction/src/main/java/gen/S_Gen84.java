
  package gen;
  public class S_Gen84 {
  		@com.google.inject.Inject
  		public S_Gen84(S_Gen85 s_gen85){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen85 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  