
  package gen;
  public class Q_Gen51 {
  		@com.google.inject.Inject
  		public Q_Gen51(Q_Gen52 q_gen52){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen52 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  