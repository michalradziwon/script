
  package gen;
  public class O_Gen152 {
  		@com.google.inject.Inject
  		public O_Gen152(O_Gen153 o_gen153){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen153 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  