
  package gen;
  public class B_Gen51 {
  		@com.google.inject.Inject
  		public B_Gen51(B_Gen52 b_gen52){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen52 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  