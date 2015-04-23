
  package gen;
  public class S_Gen29 {
  		@com.google.inject.Inject
  		public S_Gen29(S_Gen30 s_gen30){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen30 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  