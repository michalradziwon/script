
  package gen;
  public class O_Gen67 {
  		@com.google.inject.Inject
  		public O_Gen67(O_Gen68 o_gen68){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen68 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  