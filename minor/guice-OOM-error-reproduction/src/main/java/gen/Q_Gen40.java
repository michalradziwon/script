
  package gen;
  public class Q_Gen40 {
  		@com.google.inject.Inject
  		public Q_Gen40(Q_Gen41 q_gen41){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen41 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  