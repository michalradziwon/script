
  package gen;
  public class F_Gen51 {
  		@com.google.inject.Inject
  		public F_Gen51(F_Gen52 f_gen52){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen52 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  