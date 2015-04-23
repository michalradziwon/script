
  package gen;
  public class S_Gen52 {
  		@com.google.inject.Inject
  		public S_Gen52(S_Gen53 s_gen53){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen53 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  