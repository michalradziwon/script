
  package gen;
  public class M_Gen149 {
  		@com.google.inject.Inject
  		public M_Gen149(M_Gen150 m_gen150){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen150 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  