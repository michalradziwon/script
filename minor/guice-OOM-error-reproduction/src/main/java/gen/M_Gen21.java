
  package gen;
  public class M_Gen21 {
  		@com.google.inject.Inject
  		public M_Gen21(M_Gen22 m_gen22){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen22 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  