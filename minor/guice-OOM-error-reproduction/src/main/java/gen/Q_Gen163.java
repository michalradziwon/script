
  package gen;
  public class Q_Gen163 {
  		@com.google.inject.Inject
  		public Q_Gen163(Q_Gen164 q_gen164){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen164 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  