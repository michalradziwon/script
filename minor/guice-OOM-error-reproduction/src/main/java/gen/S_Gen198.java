
  package gen;
  public class S_Gen198 {
  		@com.google.inject.Inject
  		public S_Gen198(S_Gen199 s_gen199){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen199 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  