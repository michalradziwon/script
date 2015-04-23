
  package gen;
  public class Q_Gen53 {
  		@com.google.inject.Inject
  		public Q_Gen53(Q_Gen54 q_gen54){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen54 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  