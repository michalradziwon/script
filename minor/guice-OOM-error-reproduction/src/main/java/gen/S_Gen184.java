
  package gen;
  public class S_Gen184 {
  		@com.google.inject.Inject
  		public S_Gen184(S_Gen185 s_gen185){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen185 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  