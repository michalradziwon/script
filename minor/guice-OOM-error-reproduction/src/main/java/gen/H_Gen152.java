
  package gen;
  public class H_Gen152 {
  		@com.google.inject.Inject
  		public H_Gen152(H_Gen153 h_gen153){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen153 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  