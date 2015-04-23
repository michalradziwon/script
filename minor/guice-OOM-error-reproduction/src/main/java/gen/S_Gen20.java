
  package gen;
  public class S_Gen20 {
  		@com.google.inject.Inject
  		public S_Gen20(S_Gen21 s_gen21){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen21 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  