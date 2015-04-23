
  package gen;
  public class Q_Gen29 {
  		@com.google.inject.Inject
  		public Q_Gen29(Q_Gen30 q_gen30){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen30 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  