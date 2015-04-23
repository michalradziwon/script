
  package gen;
  public class Q_Gen182 {
  		@com.google.inject.Inject
  		public Q_Gen182(Q_Gen183 q_gen183){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen183 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  