
  package gen;
  public class O_Gen137 {
  		@com.google.inject.Inject
  		public O_Gen137(O_Gen138 o_gen138){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen138 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  