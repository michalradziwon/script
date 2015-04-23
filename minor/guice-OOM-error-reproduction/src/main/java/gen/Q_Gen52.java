
  package gen;
  public class Q_Gen52 {
  		@com.google.inject.Inject
  		public Q_Gen52(Q_Gen53 q_gen53){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen53 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  