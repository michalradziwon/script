
  package gen;
  public class R_Gen51 {
  		@com.google.inject.Inject
  		public R_Gen51(R_Gen52 r_gen52){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen52 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  