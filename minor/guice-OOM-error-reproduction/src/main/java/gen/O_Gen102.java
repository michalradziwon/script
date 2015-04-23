
  package gen;
  public class O_Gen102 {
  		@com.google.inject.Inject
  		public O_Gen102(O_Gen103 o_gen103){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen103 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  