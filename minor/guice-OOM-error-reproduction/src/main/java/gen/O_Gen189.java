
  package gen;
  public class O_Gen189 {
  		@com.google.inject.Inject
  		public O_Gen189(O_Gen190 o_gen190){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen190 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  