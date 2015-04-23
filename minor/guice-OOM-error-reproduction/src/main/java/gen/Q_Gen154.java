
  package gen;
  public class Q_Gen154 {
  		@com.google.inject.Inject
  		public Q_Gen154(Q_Gen155 q_gen155){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen155 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  