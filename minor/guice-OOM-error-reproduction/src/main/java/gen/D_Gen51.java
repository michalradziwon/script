
  package gen;
  public class D_Gen51 {
  		@com.google.inject.Inject
  		public D_Gen51(D_Gen52 d_gen52){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen52 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  