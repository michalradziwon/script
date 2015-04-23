
  package gen;
  public class O_Gen181 {
  		@com.google.inject.Inject
  		public O_Gen181(O_Gen182 o_gen182){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen182 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  