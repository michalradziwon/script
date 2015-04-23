
  package gen;
  public class O_Gen174 {
  		@com.google.inject.Inject
  		public O_Gen174(O_Gen175 o_gen175){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen175 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  