
  package gen;
  public class O_Gen63 {
  		@com.google.inject.Inject
  		public O_Gen63(O_Gen64 o_gen64){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen64 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  