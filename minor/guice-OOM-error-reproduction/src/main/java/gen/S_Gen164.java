
  package gen;
  public class S_Gen164 {
  		@com.google.inject.Inject
  		public S_Gen164(S_Gen165 s_gen165){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen165 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  