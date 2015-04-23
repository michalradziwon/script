
  package gen;
  public class S_Gen194 {
  		@com.google.inject.Inject
  		public S_Gen194(S_Gen195 s_gen195){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen195 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  