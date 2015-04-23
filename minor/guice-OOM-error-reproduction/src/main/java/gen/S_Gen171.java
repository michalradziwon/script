
  package gen;
  public class S_Gen171 {
  		@com.google.inject.Inject
  		public S_Gen171(S_Gen172 s_gen172){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen172 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  