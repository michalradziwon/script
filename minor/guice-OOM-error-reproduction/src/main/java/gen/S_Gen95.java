
  package gen;
  public class S_Gen95 {
  		@com.google.inject.Inject
  		public S_Gen95(S_Gen96 s_gen96){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen96 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  