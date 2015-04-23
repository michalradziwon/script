
  package gen;
  public class Q_Gen192 {
  		@com.google.inject.Inject
  		public Q_Gen192(Q_Gen193 q_gen193){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen193 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  